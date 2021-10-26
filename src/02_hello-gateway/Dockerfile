FROM python:3
ADD hello-gateway.py /

RUN pip install prometheus-client

CMD [ "python", "./hello-gateway.py" ]