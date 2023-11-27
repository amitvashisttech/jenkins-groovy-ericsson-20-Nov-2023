## Introduction : Jenkins + Ansible

#### 1. Create a New Jenkins Image which has Ansible Installed 
   
        Dockerfile: 
        ```
   	FROM jenkins/jenkins

	USER root

	RUN apt-get update && apt-get install python3-pip -y && \
		pip3 install ansible --upgrade

	USER jenkins
	
	```
#### 2.	Go and check the ansible key in the existing jenkins 
        ```
	mkdir /root/jenkins_home/ansible/ -p 
	cp -rf jenkins-groovy-ericsson-20-Nov-2023/02-RemoteHost/centos7/remote-key* /root/jenkins_home/ansible/
	chown 1000:1000 -R /root/jenkins_home/ansible
	chmod 600 /root/jenkins_home/ansible/remote-key
	```
#### 3. Now we need to setup ansible inventory file under : /root/jenkins_home/ansible/hosts
	
	```
	[all:vars]

	ansible_connection = ssh

	[test]

	test1 ansible_host=remote-host ansible_user=remote_user ansible_private_key_file=/var/jenkins_home/ansible/remote-key
	web1 ansible_host=web ansible_user=remote_user ansible_private_key_file=/var/jenkins_home/ansible/remote-key
        ```
	
#### 4. Deploy Jenkins & Remote Hosts
	```
	docker-compose up -d --build 
	```
	
#### 5. Go and check the ansible installation & key in the existing jenkins 
	```
	docker exec -it jenkins bash 
	ansible --version 
	cd /var/jenkins_home/ansible
	```
	```
	ansible test1 -i hosts -m ping
	```
	```
	test1 | SUCCESS => {
        "ansible_facts": {
        "discovered_interpreter_python": "/usr/bin/python"
        },
        "changed": false,
        "ping": "pong"
        }
	```
