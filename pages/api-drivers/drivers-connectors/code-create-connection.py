# Two ways to connect using the Python driver:

# 1. Automatic connection

from trueno_python_driver import Trueno

trueno = Trueno(host='http://localhost', port=8000)

#May use 'with'
with Trueno(host='http://localhost', port=8000) as trueno:
    if trueno.connected():
       #Do work

#######

# 2. Manual connection (can define callbacks)

from trueno_python_driver import Trueno

def conn_callback(*args):
    print('Connected')

def disc_callback(*args):
    print('Disconnected')


trueno = Trueno(host='http://localhost', port=8000, auto_connect=False)

trueno.connect(conn_callback, disc_callback)