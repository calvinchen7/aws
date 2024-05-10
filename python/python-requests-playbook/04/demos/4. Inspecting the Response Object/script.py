import requests


response = requests.get("http://127.0.0.1:8000/api/items")

# Payload in raw byte format
# print(response.content)

# Raw bytes in hexadecimal
# print(response.content.hex())

# Checking the content-type response header
# print(response.headers["content-type"])

# Payload converted to a string
# response.encoding = "utf-8"
# print(response.text)

# Converting payload to JSON
# print(response.json())
print(response.json()[1]["name"])