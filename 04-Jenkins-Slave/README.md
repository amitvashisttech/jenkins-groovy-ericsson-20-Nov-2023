Jenkins Cloud Docker Agents. 
===========================
         Step 1: Login the Docker Host Machine.
         ```
            export TERM=xterm
         ```
  
	 Step 2: Log in to the server and open the docker service file /lib/systemd/system/docker.service. Search for ExecStart and replace that line with the following.
	    ```
		#ExecStart=/usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock
        ExecStart=/usr/bin/dockerd -H tcp://0.0.0.0:4243 -H fd:// --containerd=/run/containerd/containerd.sock
		```
	 Step 3: Reload and restart docker service.
	   ```
	   sudo systemctl daemon-reload
	   sudo service docker restart
	   ```
	 Step 4: Validate API by executing the following curl commands. Replace 54.221.134.7 with your host IP.
		```
		curl http://localhost:4243/version
		curl http://172.31.0.100:4243/version
		```  
	   
	Step 5: Build a Docker Slave Image with SSH Access
        ```	  
	    cd 04-Jenkins-Slave
	    docker build -t jenkins-slave .
		```   
		
	Step 6: Head over to Jenkins Dashboard –> Manage Jenkins –> Manage Plugins.

        Step 7: Under the Available tab, search for “Docker” and install the docker cloud plugin and restart Jenkins. 
	
	Step 8: Once installed, head over to Jenkins Dashboard –> Manage Jenkins –> Configure system.
	
	Step 9: Under “Configure System“, if you scroll down, there will be a section named “cloud” at the last.
	
	Step 10: Under docker -> 
	          Host: tcp://172.31.0.100:4243
			  Test Connection
			  Enable [*]
        Step 10.5: Create SSH Credentials for Jenkins Slave
                   Manage Jenkins -> Credentials -> Global Credentials -> Add -> Username and Password:
                   Username: jenkins
                   Password: passowrd 
                   Decription: jenkins-slave-credentials
			  
	Step 11: Now, from “Docker Agent Template” dropdown, click the “Add Docker template” and fill in the details based on the explanation	

            Name : jenkins-slave-ssh
            Label : jenkins-slave-ssh			
			Docker Image : jenkins-slave
			Remote File System Root : /home/jenkins
			Usage : Use this node as much as possible 
			Connect Method: Connect SSH 
			      SSH Key : Use configured SSH Credentials
				  SSH Credentials : jenkins/password ( Select the jenkins-slave-credentials created in Step 10.5)
				  Hostkey Verification : Non Verifying Verification Strategy
			Stop Timeout: 10 
            Pull Strategy: Never Pulled 
			-> Save 
			
	Step 12: Test Jenkins Build Inside a Docker container
	         Create a freestyle job, select “Restrict where this project can be run” option and select the docker host as a slave using the label.
             ```
			 echo "Hello World" ; hostname -f ; sleep 90
			 ```
			 
	Step 13: Master Node to run only Label Jobs 
             -> Manage Jenkins -> Nodes -> Built In Nodes -> Configure
             No. Excuter : 2 
             Label       : Jenkins-Master 
             Usage       : Only build the Job with Label Expression matching to this node.
