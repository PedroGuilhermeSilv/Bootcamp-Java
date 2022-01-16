# Fundamento de Redes
- Todos aparelhos conectados na rede são chamados de nó.<br>
- Rede Wan é uma rede geograficamente distribuída.<br>
- Rede Man é uma rede metropolitana que interligam várias redes locais.<br>
- Rede Lan é uma rede local de uma forma geral em um único prédio.<br>
- DNS dá nome aos IPs.<br>

## Protocolo
 É a "Linguagem" usada pelos dispositivos de uma rede de modo que eles consigam se entender.<br>
- IP(Protocolo de Internet)- Indetificam seu computador em uma rede.<br>
- ICMP(Internet Control Message Protocol) - tem por objetivo prover mensagens de controle na comunicação entre nós.<br>
- DNS(Domain Name Server) - esse protocolo de aplicação tem por função identificar endereços dos caminhos de algumas redes.<br>

## Interface de Rede
	Interface de rede é um software e hardware que faz a comunicação em uma rede de comptadores.<br>
- netmask = separa a rede privada do computador da rede pública.<br>
- ipv4 = ip que identifica o computador para outros nõs.
- broadcast = ip público da minha rede local.
- ether = endereço físico da placa de rede.




## Comandos
- ifconfig = mostra informações dos IP locais.
- hostname = mostra o nome do computador na rede.
- hostname -I = mostra o IP do computador na rede.
- hostname -i = mostra o IP Lupback do computador na rede.
- who = informações curtas sobre o usuário do computador na rede.<br>
- w - exibe informações detalhadas sobre o usuário do computador na rede. <br>
- whoami = nome do usuário logado.
- ping "link" = envia mensagem de controles p/ determinado  host para ver se está ativo.
- ping "link" -m 4 = Testa por 4 tentativamos e nos retorna os dados.<br>
- dig "link" = retorna as informações do DNS.
- dig "link" "+short" = retorna apenas o DNS.
- traceroute "domínio"  = retorna o caminho de nós até chegar ao domínio.<br>
- whois "link" = retorna informações sobre o dono e contatos do domínio.<br>
- finger = mostra quem está logado em nosso domínio. 
### extras
- init 0 = desliga a máquina.
- halt =pede autorização para desligar.
- seq 1 10 = imprime uma seq. de 1 á 10.
- ls -a= mostra diretórios ocultos.
- ls -F = mostra os diretórios com / no fim.
- nl "nome arq." = exibe um arquivo com seus números de linhas.<br>
- wc -l "nome arq." = conta o nº de linhas do arq. incluindo as em branco.<br>
- wc -w "nome arq." = conta o nº de palavras de um arq.
- wc -c "nome arq." = conta o º de caracteres de um arq.
- sort "nome arq." = organiza em ordem alfabética.
- time = exibe o tempo de processamento de um comando.
- uptime = exibe info. de carregamento do sistema.
- cmp = compara dois arq.
- route -n = exibe a tebela do roteamento IP do Kernel.
- alias = permite trocar o nome de um comando.
- last reboot = exibe info. sobre reinicializações do sistema.
- histpry -c = limpa o histórico.


