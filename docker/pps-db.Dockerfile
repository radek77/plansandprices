FROM mariadb:10.5.9

RUN apt-get update && apt-get install -y --no-install-recommends gettext mc \
&& apt-get clean \
&& rm -r /var/lib/apt/lists/*

RUN echo 'bind-address=*' >> /etc/mysql/conf.d/docker.cnf
RUN echo 'skip-log-bin' >> /etc/mysql/conf.d/docker.cnf
RUN echo 'max_connections=100000' >> /etc/mysql/conf.d/docker.cnf

RUN echo 'SELECTED_EDITOR="/usr/bin/mcedit"' > ~/.selected_editor
COPY ./.bashrc /tmp/
RUN cat /tmp/.bashrc >> ~/.bashrc && rm -rf /tmp/.bashrc
