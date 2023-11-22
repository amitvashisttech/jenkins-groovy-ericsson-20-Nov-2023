### It's time to integrate Jenkins Web UI with Ansible. 
	
#### 1. Manage Jenkins -> Plugin -> Ansible -> Install. 
	
#### 2. Create a freestyle Job ( Ansible Job ) -> Build Step ( Invoke Ansible Playbook ) 
	```
         - Restrict where this project can be run : Jenkins-Master
	 - Playbook Path 		 :  /var/jenkins_home/ansible/play-1.yml
	 - Inventory / Host Path 	 :  /var/jenkins_home/ansible/hosts
	 - Advanced ->			 :  [*] Disable the Hosts SSH Key Check
	 - Build & Check 
	 ```
#### 3. Update the Playbook with new message 
	 
	 ```
	 - hosts: test1
	   name: "Jenkins & Ansible Test Play"
	   tasks:
	   - shell: echo "Welcome to the world of Ansible & Jenkins" >> /tmp/ansible-file
	 ```
	 
#### 4. Now lets check the file is created in the remote hosts or not ? 
	
	```
	docker exec -it remote-host bash
	cat /tmp/ansible-file
        ```	 
