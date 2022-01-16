# Pacotes
São programas colocados dentro de um arquivo identificados por sua extensão, e incluem arquivos necessários para a instalação do programa.
Mais conhecidos : .deb .rpm

# Gerenciadores
São sistemas que possuem resolução automática de dependências
entre pacotes, método fácil de instalação de pacotes.
Ex: dpgk, apt e yum
 
## Instalação 
- apt<br>
nmap
sudo apt install pacote<br> 

- dpkg<br> 
sudo dpkg -i pacote<br> 

- yum<br> 
sudo yum install pacote<br>  

- rpm<br>
sudo tpm -ivh pacote <br>
sudo tpm -ivh --nodeps pacote <br>
## Atualização<br> 
- apt<br>  
sudo apt upgrade pacote<br> 

- rpm<br>
rpm -U pacote.rpm  
## Remoção	
apt<br> 
sudo apt remove pacote<br>  

- rpm<br>
sudo -e pacote  

- yum<br> 
sudo yum remove pacote<br>  


## Atualização de Sistema 
- apt<br>  
apt update<br>  
ou<br> 
apt update && apt upgrade<br> 

- yum<br> 
sudo yum update pacote<br>  

## Site de Pacotes
pkgs.org<br>  
rpm.<br> 
## Descrição do pacote
- dpkg<br> 
sudo dpkg -I pacote<br> 

### OBS
sudo su = muda para usuário root