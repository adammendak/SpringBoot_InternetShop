from django.shortcuts import render
from django.http import HttpResponse

def home(request):
    return render(request, "main/home.html",
                  {'name' : 'Adam'})

def helloWorld(request):
    return HttpResponse("Hello Worlds!")
