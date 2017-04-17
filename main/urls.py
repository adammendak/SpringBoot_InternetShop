from django.conf.urls import url

from . import views

urlpatterns = [
    url(r'^(?P<questtion_id>[0-9]+)/$', views.detail, name='detail'),
    url(r'^(?P<questtion_id>[0-9]+)/results/$', views.results, name='results'),
    url(r'^(?P<questtion_id>[0-9]+)/vote/$', views.vote, name='views')
]
