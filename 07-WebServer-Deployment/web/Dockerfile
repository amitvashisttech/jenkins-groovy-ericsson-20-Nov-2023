FROM remote-host

USER root

RUN mkdir /root/.ssh && \
    chmod 700 /root/.ssh

COPY remote-key.pub /root/.ssh/authorized_keys

RUN chown root:root   -R /root/ && \
    chmod 400 /root/.ssh/authorized_keys
