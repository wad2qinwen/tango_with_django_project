# Generated by Django 2.2.17 on 2023-02-05 14:32

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('rango', '0001_initial'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='category',
            name='slug',
        ),
    ]