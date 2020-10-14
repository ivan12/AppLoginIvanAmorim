
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

##


#App Login Ivan Amorim

1) Download the project files from the GitHub Repository.

2) Import the project into Android Studio (I'm using version 1.5.1).

3) Configure the project to run with Gradle (if you don't have it on your Android Studio, please download it).

4) Use com.android.tools.build:gradle:1.5.0 or higher.

5) Click the green "Run As Android" button.

6) Login screen:

The program will open on a home screen with two EditText and two buttons:

EditText-1) Insert the user name if you already have it in the bank, if you do not have to register.

EditText-2) Enter the user's password by encrypted standard.

Button-1) Clicking on the Register button goes to a registration screen.

Button-2) Clicking on the Login button if it passes the validation will go to a screen that will show the user's name, latitude and longitude.

7) Display Screen

Upon successful login your name, latitude and longitude will appear.

When logging out and logging in again, your user will show their name, their current latitude and longitude and just below it will appear their latitude and longitude that were previously saved

8) Registration Screen:

3 EditText and a button will appear:

EditText-1) Enter the name of the user to be registered.

EditText-2) Enter the password for the new user.

EditText-3) Repeat the same password as the new user.

Button-2) Clicking on the Register button will save the name of the user entered along with his password (will also create an id).

9) Validations and MSGs:

Validation / MSGs-1) When entering the wrong username or password or not registered with the bank, the following message will appear ("Username or password incorrect!").

Validation / MSGs-2) The following message will appear on the registration screen when entering different password1 and passwordConfirmation ("Different passwords !!").

Validation / MSGs-3) When clicking register on the registration screen and if it is saved successfully, the following message will appear ("User Saved successfully !!").

Validation / MSGs-4) When you log in successfully, your latitude and longitude will appear and in addition you will save and the message ("Localization Saved successfully !!") will appear.
