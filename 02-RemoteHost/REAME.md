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
