import requests

try:
	# response = requests.get("http://127.0.0.1:8000/slow-response", timeout=(5, 3))
    response = requests.get("http://10.255.255.1", timeout=(5, 6))
    print(response.json())
except requests.exceptions.ConnectTimeout:
    print("The request failed to connect in the allotted time.")
except requests.exceptions.ReadTimeout:
    print("The server did not send any data in the allotted amount of time.")
except requests.exceptions.Timeout:
    print("A timeout error occurred.")