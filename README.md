This is a personal template for running prometheus on a naked system with some minor configation

## run (with share)
docker run -d -v $PWD/etc/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml --name prometheus-servers -p 127.0.0.1:9090:9090 prom/prometheus

