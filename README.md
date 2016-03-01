
#App Login Ivan Amorim

1) Baixe os arquivos do projeto no Repositório do GitHub.

2) Importe o projeto no Android Studio (Estou Utilizando a versão 1.5.1).

3) Configure o projeto para executar com Gradle (caso não tenha em seu Android Studio, favor baixar).

4) Utilize com.android.tools.build:gradle:1.5.0 ou superior.

5) Clique no botão verde "Run As Android".

6) Tela de Login:

	O programa irá abrir em uma tela inicial com dois EditText e dois botões:

	EditText-1) Colocar o nome do usuario caso já tenha no banco se nao tiver favor cadastrar.
	
	EditText-2) Colocar a senha do usuario por padrao criptografado.

	Button-1) Clicando no Botao registrar vai para uma tela de registro.
	
	Button-2) Clicando no Botao Login se passar pela validação irá para uma tela que mostrará o nome do usuario a sua latitude e longitude.
	
7) Tela de Display

	Ao logar com sucesso irá aparecer seu nome, sua latitude e sua longitude. 
	
	Ao sair e entrar novamente com seu usuario mostrará seu nome sua latitude e longitude atuais e logo abaixo aparecerá sua latitude e longitude que foram salvas anteriormente
	
8) Tela de Cadastro:

	Aparecerá 3 EditText e um botão:
	
	EditText-1) Colocar o nome do usuario que será cadastrado.
	
	EditText-2) Colocar a senha do novo usuario.

	EditText-3) Repetir a mesma senha do novo usuario.
	
	Button-2) Clicando no Botao Register ele irá salvar o nome do usuario digitado juntamente com a sua senha (também ira criar um id).
	
9) Validações e MSGs:
	
	Validação/MSGs-1) Ao entrar com usuario ou senha errados ou nao cadastrados no banco aparecerá a seguinte mensagem ("Username ou password incorretos!").
	
	Validação/MSGs-2) Na tela de cadastro ao colocar senha1 e senhaConfirmação diferentes aparecerá a seguinte mensagem ("Senhas diferentes!!").

	Validação/MSGs-3) Ao clicar em register na tela de cadastro e se for salvo com sucesso aparecerá a seguinte mensagem ("Usuario Salvo com sucesso!!").
	
	Validação/MSGs-4) Ao logar com sucesso irá aparece sua latitude e longitude e alem disso irá salvar e aparecer a mensagem ("Localizacao Salva com sucesso!!").

