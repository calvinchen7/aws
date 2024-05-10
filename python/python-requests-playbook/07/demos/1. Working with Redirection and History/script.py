import requests


response = requests.get("http://127.0.0.1:8000/old-route")
# response = requests.get("http://127.0.0.1:8000/old-route", allow_redirects=False)
# response = requests.head("http://127.0.0.1:8000/old-route", allow_redirects=True)

print(response.history)
print(response.url)
print(response.status_code)
print(response.text)