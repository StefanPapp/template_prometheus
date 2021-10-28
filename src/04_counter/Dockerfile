FROM python:3
ADD hello-prometheus.py /

RUN pip install prometheus-client

CMD [ "python", "./hello-prometheus.py" ]