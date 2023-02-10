# -*- coding: utf-8 -*-
"""
Created on Sat Feb  4 15:47:39 2023

@author: 86177
"""

from django.urls import path 
from rango import views 

app_name = 'rango'

urlpatterns = [
        path('', views.index, name = 'index'),
        path('about/', views.about, name = 'about'),
    ]