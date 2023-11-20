## Jenkins Deployment 

### Step1 : Install Docker RunTime Engine

```
cd 01-Jenkins
sh 01-Install-docker.sh
``` 



### Step2 : Now install Docker Compose  
```
sh 02-Dockercompose-Install.sh
```

### Step3 : Bring up the Jenkins instances 
```
docker-compose up -d
```

### Step4 : Let's check.
```
docker-compose ps 
```

### Step5 : Update the Permission
```
chown -R 1000:1000 /root/jenkins-home
```


### Step6 : Let's check.
```
docker-compose up -d  
```

### Step7 : Check the logs 
```
docker ps 
docker logs -f jenkins 
```

### Step8 : Check the Node IP Address & Open the same in brower on Port 8080
```
http://172.31.0.100:8080
```
