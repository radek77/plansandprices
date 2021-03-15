FROM library/ubuntu:latest

RUN apt update && apt install -y --no-install-recommends mysql-client mc && apt clean && rm -r /var/lib/apt/lists/*

COPY ./wait-for-it.sh /wait-for-it.sh
COPY ./plans_prices.sql.tar.gz /plans_prices.sql.tar.gz

ENTRYPOINT ["/entrypoint.sh"]
