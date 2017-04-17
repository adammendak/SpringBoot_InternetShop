from django.shortcuts import get_object_or_404, render
from django.http import HttpResponse
from django.http import Http404
#from django.template import loader

from .models import Question

def home(request):
    return render(request, "main/home.html",
                  {'name' : 'Adam'})

# def index(request):
#    latest_question_list = Question.objects.order_by('-pub_date')[:5]
#    output = ', '.join([q.question_text for q in latest_question_list])
#    return HttpResponse(output)

# druga wersja
# def index(request):
#     latest_question_list = Question.objects.order_by('-pub_date')[:5]
#     template = loader.get_template('main/index.html')
#     context = {
#         'latest_question_list': latest_question_list,
#     }
#     return HttpResponse(template.render(context, request))

def index(request):
    latest_question_list = Question.objects.order_by('-pub_date')[:5]
    context = { 'latest_question_list' : latest_question_list}
    return render(request, "main/index.html", context)

def helloWorld(request):
    return HttpResponse("Hello Worlds!")

# def detail(request, question_id):
#     return HttpResponse("You're looking at question %s." % question_id)

# druga wersja
# def detail(request, question_id):
#     try:
#         question = Question.objects.get(pk=question_id)
#     except Question.DoesNotExist:
#         raise Http404("Question does not exist")
#     return render(request, 'main/detail.html', {'question' : question})

def detail(request, question_id):
    question = get_object_or_404(Question, pk=question_id)
    return render(request, "main/detail.html", {'question' : question})


def results(request, question_id):
    response = "You're looking at the results of question %s."
    return HttpResponse(response % question_id)

def vote(request, question_id):
    return HttpResponse("You're voting on question %s." % question_id)

