#### Parameter to Ansible via Jenkins

#### 1. Create / update the playbook with Ansible DEBUG Command to Take the inputs 
	
	```
	- hosts: test1
	  name: "Jenkins & Ansible Test Play"
	  tasks: 
	  - debug: 
	      msg: "{{MSG}}"
	```
#### 2. Copy the playbook to ansible folder
        cp -rf play-2.yml /root/jenkins_home/ansible
	chown 1000:1000 -R /root/jenkins_home/ansible/play-2.yml
	
#### 3. Update the Ansible Job with Paramters
	 ```
         General -> This Project is Paramterized [*]
	              NAME : ANSIBLE_MSG
		      DEFAULT VALUE : Hello World 
	```			  
#### 4. Now Inject the Patameter inside Ansible 
        ```
        Build Steps -> Invoke Ansible Playbook -> Advanced -> Extra Varibales -> Add. 
                  NAME : MSG ( Which we have configured in our playbook DEBUG - MSG )
                  VALUE : $ANSIBLE_MSG ( Which we have configured in job paramters ) 
        ```
#### 5. Build & Check Playbook Excution for ( Debug : Hello World Message ) 	

#### 6. Re-Run the Job with Paramter value : "Hey Jenkins"
