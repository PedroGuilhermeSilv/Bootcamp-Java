# Entendendo o Java
## Caracter�sticas 
- Compilada
- Interpretada.
- Fortemente tipada.
- Linguagem de alto n�vel
- Executada em uma m�quina virtual - JVM

# Entendendo a JVM
## Caracter�sticas 
- Execu��o de pilhas
- Gerenciamento de mem�ria.
- Gerenciamento de threads.
- Otimiza��o de c�digo(Compila��o JIT-Just in time)
- Garbage Collector(GC). Limpeza da mem�ria suja.
## Palavras reservadas:
S�o palavras que n�o podem ser usadas para cria��o de objetos ou classes pois o Java j� utiliza as mesmas.
## Classes
Sempre incia com letra Mai�scula e representa o mundo real.
## Modificadores de Acesso
- public 
 Qualquer classe de qualquer pacote poder� ter acesso ao atributo ou m�tedo.
- protected
 Qualquer classe definida no mesmo pacote ou subclasse.
- Sem modificador 
 Apenas classes definidas no mesmo pacote.
- private 
 Apenas a pr�pria classe.

## M�todos
Construtores = Definem como uma classe ser� contruida.<br>
Comuns =  Definem comportamentos que podem ou n�o ser atribu�das �s regras de neg�cio.

## Estrutura de condi��o
- if-else
if (condi��o){
return x;
}
else {
return y;
}

- swhitch-case
switch (valor){
	case x:
		return q;
	case y:
		return w;
	defult:
		return 0;
}


## Estrutura de repeti��o.
- while
while(condi��o){
fa�a.
}

- do-while
do{
	fa�a
}while(condi��o)

- for 
for (condi��o){
fa�a
}
- enhanced for
for (variavel i : itens){
fa�a
}

## Coment�rio
- Em linha
 // 
- Em bloco
/**  */

## Javadoc
 � uma ferramenta para documenta��o no formato HTML que se baseia nos coment�rios do c�digo-fonte por Tags.
## Tags
- @author
Especifica o autor da classe.
- @deprecated
identifica classes ou m�todos obsoletos.
- @link 
Possibilita a defini��o de um link p/ outro documento local ou remoto atrav�s de um url.
- @param 
descreve um par�metro que ser� passado a um m�todo.
- @return
Descreve qual tipo de retorno.
- @see
Associa a outras classes ou m�todos
- @since
Descreve desde quando uma classe ou m�todos foi adicionados
- @throws 
Descreve os tipos de exce��es que podem ser lan�adas por um m�todo
# Convers�es
## Upcast(impl�cito)
- Promo��o de um tipo de dado de menor capacidade para maior capacidade (tamanho).
long l; int i; l=i;
## Downcast(expl�cito)
- Promo��o de um tipo de dado de maior capacidade para menor capacidade (tamanho).
int i; long l=100; i=(int)l;