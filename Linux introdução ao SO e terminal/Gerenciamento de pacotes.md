# Pacotes
S�o programas colocados dentro de um arquivo identificados por sua extens�o, e incluem arquivos necess�rios para a instala��o do programa.
Mais conhecidos : .deb .rpm

# Gerenciadores
S�o sistemas que possuem resolu��o autom�tica de depend�ncias
entre pacotes, m�todo f�cil de instala��o de pacotes.
Ex: dpgk, apt e yum
 
## Instala��o 
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
## Atualiza��o<br> 
- apt<br>  
sudo apt upgrade pacote<br> 

- rpm<br>
rpm -U pacote.rpm  
## Remo��o	
apt<br> 
sudo apt remove pacote<br>  

- rpm<br>
sudo -e pacote  

- yum<br> 
sudo yum remove pacote<br>  


## Atualiza��o de Sistema 
- apt<br>  
apt update<br>  
ou<br> 
apt update && apt upgrade<br> 

- yum<br> 
sudo yum update pacote<br>  

## Site de Pacotes
pkgs.org<br>  
rpm.<br> 
## Descri��o do pacote
- dpkg<br> 
sudo dpkg -I pacote<br> 

### OBS
sudo su = muda para usu�rio root