# Generated by Django 2.2.17 on 2023-02-06 03:33

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('rango', '0003_auto_20230206_0328'),
    ]

    operations = [
        migrations.AddField(
            model_name='page',
            name='views',
            field=models.IntegerField(default=0),
        ),
    ]
