## Create our first Playbook 

#### 1. Create our first ansible playbook
	
	cat play.yaml
	```
	- hosts: test1
	  name: "Jenkins & Ansible Test Play"
	  tasks:
	  - shell: echo "Welcome to the world of Ansible" > /tmp/ansible-file
	```
#### 2. Copy the Playbook to Jenkins Home Dir Ansible Folder 
        ```	
	cp -rf play-1.yml /root/jenkins_home/ansible
	chown 1000:1000 -R /root/jenkins_home/ansible/play-1.yml
	```
#### 3. Go to Jenkins & Run the playbook 
	```
	docker exec -it jenkins bash 
	cd ../ansible
	ansible-playbook play.yaml
	```
        ```
	jenkins@e0bed026683b:~/ansible$ ansible-playbook play-1.yaml

	PLAY [Jenkins & Ansible Test Play] *************************************************************************************************************************

	TASK [Gathering Facts] *************************************************************************************************************************************
	ok: [test1]

	TASK [shell] ***********************************************************************************************************************************************
	changed: [test1]

	PLAY RECAP *************************************************************************************************************************************************
	test1                      : ok=2    changed=1    unreachable=0    failed=0    skipped=0    rescued=0    ignored=0

	jenkins@e0bed026683b:~/ansible$
	```
	
#### 4. Now lets check the file is created in the remote hosts or not ? 
	
	```
	docker exec -it remote-host bash
	cat /tmp/ansible-file
	```
