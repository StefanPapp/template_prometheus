import http.server
from prometheus_client import start_http_server
from prometheus_client import Counter
import time

if __name__ == "__main__":
    start_http_server(8000)
    c = Counter('my_failures', 'Description of counter')
    for i in range(100):
        c.inc()
        time.sleep(10)




