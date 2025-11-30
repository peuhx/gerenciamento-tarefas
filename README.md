Gerenciador de Tarefas

Este projeto foi criado com a ideia de treinar Java de uma forma prática e simples. A proposta é ter um gerenciador de tarefas totalmente no console, onde é possível cadastrar, listar, atualizar e excluir tarefas com um fluxo direto e fácil de entender. O foco aqui foi aprender a organizar melhor o código e estruturar um pequeno sistema mesmo sem usar frameworks.

Descrição do Projeto

A aplicação funciona por meio de um menu no console, onde cada opção representa uma ação do sistema. As tarefas possuem título, descrição e data, e tudo foi organizado em diferentes camadas para facilitar a leitura e a manutenção do código. O projeto é pequeno, mas ajuda bastante a entender como dividir responsabilidades dentro de uma aplicação Java.

Como Executar

Para rodar o projeto, basta ter o Java instalado. No diretório principal do projeto, a compilação pode ser feita executando:

javac -d out src/main/java/model/Tarefa.java src/main/java/repository/TarefaRepository.java src/main/java/service/TarefaService.java src/main/java/app/Main.java

Depois disso, o programa pode ser iniciado com:

java -cp out app.Main

Assim que abrir, o menu aparece e você já consegue usar todas as funções disponíveis.

Tecnologias Usadas

O sistema foi desenvolvido apenas com Java, seguindo conceitos básicos de orientação a objetos. A estrutura segue o padrão de diretórios do Maven, mas sem dependências externas. É um projeto simples e ideal para estudos.

Instruções de Compilação e Execução

A compilação deve ser feita apontando para a pasta src/main/java, e os arquivos gerados ficam dentro da pasta out. Caso ela não exista, será criada automaticamente durante a compilação.

Compilar:

javac -d out src/main/java/**/*.java

Executar:

java -cp out app.Main

Autor

peuhx
