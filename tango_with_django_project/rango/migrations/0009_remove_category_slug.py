# Generated by Django 2.2.17 on 2023-02-06 04:26

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('rango', '0008_category_slug'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='category',
            name='slug',
        ),
    ]
