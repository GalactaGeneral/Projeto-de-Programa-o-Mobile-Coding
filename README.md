# Projeto-de-Programa-o-Mobile-Coding

Este é um simples aplicativo que permite o registro diário de peso corporal. Ele foi construído utilizando a biblioteca React Native e os componentes utilizados incluem View, Text, TextInput, StyleSheet, TouchableOpacity e FlatList.

O aplicativo permite que o usuário insira o seu peso em quilogramas em um campo de entrada e, ao tocar no botão "Adicionar", o peso é registrado na lista abaixo juntamente com a data atual. Os registros são exibidos em ordem cronológica decrescente e a lista pode ser rolada para visualizar entradas anteriores.

O aplicativo foi construído com base em dois estados controlados pelo hook useState: weight, que representa o peso atual inserido pelo usuário, e entries, que é um array que armazena todos os registros de peso.

A interface do aplicativo foi estilizada utilizando a propriedade StyleSheet e os componentes são organizados em uma estrutura de árvore utilizando o componente View.

Para testar o aplicativo, basta executá-lo em um emulador ou dispositivo Android ou iOS com as dependências instaladas.

Como executar:

-Para executar este aplicativo em seu dispositivo, você precisará ter um ambiente de desenvolvimento React Native configurado em sua máquina. Se você não tiver o ambiente configurado, siga o guia oficial de instalação.

Após configurar o ambiente, siga estas etapas para executar o aplicativo:

-Clone este repositório em sua máquina
-Abra um terminal na raiz do projeto e execute o comando npm install para instalar as dependências do projeto
-Execute o comando npm start para iniciar o servidor de desenvolvimento
-No terminal, você verá um QR code. Instale o aplicativo Expo em seu dispositivo móvel e escaneie o código QR para abrir o aplicativo.

Funcionalidades:

-Adicione o seu peso diário;
-Veja um histórico de todas as suas entradas anteriores.
