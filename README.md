# Marcelo Adobe Test: Mock Service


```bash
git clone https://github.com/marcelovcpereira/mvcp-adobe-service-a.git
cd mvcp-adobe-service-a/src/main/resources/devops
helm template --name marcelo-adobe-service-a --namespace marcelo-test -f values.yaml .
helm install --name marcelo-adobe-service-a --namespace marcelo-test -f values.yaml .
```