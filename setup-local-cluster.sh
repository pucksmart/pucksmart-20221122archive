#!/bin/bash
kn quickstart kind
helm repo add datadog https://helm.datadoghq.com
helm install datadog --set datadog.apiKey=${DD_API_KEY} --set datadog.appKey=${DD_APP_KEY} -f "datadog-helm.yaml" datadog/datadog