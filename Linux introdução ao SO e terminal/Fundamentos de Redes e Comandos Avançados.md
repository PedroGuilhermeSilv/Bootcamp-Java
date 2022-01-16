# Fundamento de Redes
- Todos aparelhos conectados na rede s�o chamados de n�.<br>
- Rede Wan � uma rede geograficamente distribu�da.<br>
- Rede Man � uma rede metropolitana que interligam v�rias redes locais.<br>
- Rede Lan � uma rede local de uma forma geral em um �nico pr�dio.<br>
- DNS d� nome aos IPs.<br>

## Protocolo
 � a "Linguagem" usada pelos dispositivos de uma rede de modo que eles consigam se entender.<br>
- IP(Protocolo de Internet)- Indetificam seu computador em uma rede.<br>
- ICMP(Internet Control Message Protocol) - tem por objetivo prover mensagens de controle na comunica��o entre n�s.<br>
- DNS(Domain Name Server) - esse protocolo de aplica��o tem por fun��o identificar endere�os dos caminhos de algumas redes.<br>

## Interface de Rede
	Interface de rede � um software e hardware que faz a comunica��o em uma rede de comptadores.<br>
- netmask = separa a rede privada do computador da rede p�blica.<br>
- ipv4 = ip que identifica o computador para outros n�s.
- broadcast = ip p�blico da minha rede local.
- ether = endere�o f�sico da placa de rede.




## Comandos
- ifconfig = mostra informa��es dos IP locais.
- hostname = mostra o nome do computador na rede.
- hostname -I = mostra o IP do computador na rede.
- hostname -i = mostra o IP Lupback do computador na rede.
- who = informa��es curtas sobre o usu�rio do computador na rede.<br>
- w - exibe informa��es detalhadas sobre o usu�rio do computador na rede. <br>
- whoami = nome do usu�rio logado.
- ping "link" = envia mensagem de controles p/ determinado  host para ver se est� ativo.
- ping "link" -m 4 = Testa por 4 tentativamos e nos retorna os dados.<br>
- dig "link" = retorna as informa��es do DNS.
- dig "link" "+short" = retorna apenas o DNS.
- traceroute "dom�nio"  = retorna o caminho de n�s at� chegar ao dom�nio.<br>
- whois "link" = retorna informa��es sobre o dono e contatos do dom�nio.<br>
- finger = mostra quem est� logado em nosso dom�nio. 
### extras
- init 0 = desliga a m�quina.
- halt =pede autoriza��o para desligar.
- seq 1 10 = imprime uma seq. de 1 � 10.
- ls -a= mostra diret�rios ocultos.
- ls -F = mostra os diret�rios com / no fim.
- nl "nome arq." = exibe um arquivo com seus n�meros de linhas.<br>
- wc -l "nome arq." = conta o n� de linhas do arq. incluindo as em branco.<br>
- wc -w "nome arq." = conta o n� de palavras de um arq.
- wc -c "nome arq." = conta o � de caracteres de um arq.
- sort "nome arq." = organiza em ordem alfab�tica.
- time = exibe o tempo de processamento de um comando.
- uptime = exibe info. de carregamento do sistema.
- cmp = compara dois arq.
- route -n = exibe a tebela do roteamento IP do Kernel.
- alias = permite trocar o nome de um comando.
- last reboot = exibe info. sobre reinicializa��es do sistema.
- histpry -c = limpa o hist�rico.


