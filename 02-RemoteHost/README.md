## Docker + Jenkins + SSH + Remote Host: 
       
### Step1 : Remove the old Jenkins 
        ```
        cd 01-Jenkins
        ```
        ```
	docker-compose stop 
        ```
        ```
	docker-compose rm 
        ```

### Step2: Bring Up Jenkins & Create New Docker Image & Container for Remote Host
	
        ```
	cd ../02-RemoteHost
        ```
        ```
        docker-compose up -d --build
        ```
        ```
	docker exec -it jenkins bash
        ```
        ```
        jenkins@7d4236992c59:~$ ssh remote_user@remote-host
        ```


### Step3: Install SSH Plugin 
        ```
        -> Manage Jenkins -> Manage Plugin -> Avaliable -> SSH -> Install without Restart -> Restart Jenkins	  
        ```
        ```
	-> Manage Jenkins -> Credentials -> Global Creds -> Type [Username with Private Key] -> username: remote_user & ssh key add [ key]
        ```
        ```
	-> Manage Jenkins -> Configure -> SSH -> Credentials -> Host : remote-host
        ```
	
### Step4: Create a Remote a Job to Excute on Remote Hosts
     
        ```
        -> New freestyle job [Remote Job] -> Build -> Excute Shell on remote-host using ssh -> 
        
        ```
        ```
		NAME=Amit
        echo "Hello $NAME and Current Time is $(date)" > /tmp/remotefile.txt 
        ```
        ```
 
     -> Build Now. 	  
	 
        ```
        ```
	 # docker exec -it  remote-host bash
        ```
        ```
        [root@8e9fe757a256 /]# cat /tmp/remotefile.txt
         Hello Amit and Current Time is Mon Nov 20 07:56:43 UTC 2023
        [root@8e9fe757a256 /]#
	 
        ```
