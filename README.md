# atv_7_Paulo
Resoluções da atividade 7

### A primeira atividade era para calcular a soma de 3 notas de um aluno, o valor total não podia ultrapassar 10 e o quesito para aprovação era 60% (6 pontos)
O método de resolução foi com a criação de classes, uma classe Aluno foi criada com os atributos: nome, matricula, notaProva1, notaProva2, notaTrabalho e teto.
O único método da classe Aluno é aprovacao, ela recebe como parâmetro os valores de notaProva1, notaProva2, notaTrabalho para efetuar as instruções, no caso sendo a verificação do valor total menor que 10 e se o aluno foi aprovado ou não.

### A segunda atividade foi sugerido que o usuário digitasse duas datas no formato DD/MM/AAAA e fizessemos manipulações
O método construtor deve receber como parâmetro a string data que o usuário digitou, e no próprio construtor fazer uma validação antes de instanciar a classe para criar o novo objeto com os atributos dia, mes e ano já definidos.
Deve-se usar o método split do Java para realizar a separação da string digita em dia, mes e ano.
Após isso devemos criar o método comparar e todos os get's, incluindo o get mesExtendo que retorna o nome do mês de acordo com o que foi digitado pelo usuário.
