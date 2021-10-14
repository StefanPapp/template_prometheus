This is a personal template for running prometheus on a naked system with some minor configation

## run (without share)
docker run --name prometheus -d -p 127.0.0.1:9090:9090 prom/prometheus

## run (with share)
docker run -d -v $PWD/conf/prometheus.yml:/etc/prometheus/prometheus.yml --name prometheus-servers -p 127.0.0.1:9090:9090 prom/prometheus

