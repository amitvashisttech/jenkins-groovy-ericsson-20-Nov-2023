FROM jenkins/jenkins

USER root

RUN apt-get update && apt-get install python3-pip -y && \
    pip install ansible --break-system-packages 

USER jenkins
