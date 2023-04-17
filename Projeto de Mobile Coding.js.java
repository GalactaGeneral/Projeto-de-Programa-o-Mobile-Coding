import React, { useState } from 'react';
import { View, Text, TextInput, StyleSheet, TouchableOpacity, FlatList } from 'react-native';
import { Ionicons } from '@expo/vector-icons';

/*A parte acima é a importação dos componentes cruciais para a construção do código.
Então, por partes: React seria para criar os componentes, useState permite o controle de estado; um hook.
View controla a aparência, layout e comportamento de outros componentes;
Text controla coisas como aparência do texto, cor, tamanho, fonte, etc;
TextInput se refere ao controle de campos de entrada - suas cores, tamanho, fonte, borda, etc;
StyleSheet é para definir o estilo dos componentes. Sem estilo, sem vida!;
TouchableOpacity ajuda no feedback visual quando o usuário toca em algo - uma parte fundamental o feedback;
FlatList renderiza a lista de elementos. */

/*Comentários totalmente desnecessários acima. Estão lá apenas para reforçar o aprendizado.
Jesus, que dificuldade fazer isso*/


const App = () => {
  const [weight, setWeight] = useState('');
  const [entries, setEntries] = useState([]);

  const addEntry = () => {
    const date = new Date().toLocaleDateString();
    const entry = { date, weight };
    setEntries([...entries, entry]);
    setWeight('');
  };

  const renderEntry = ({ item }) => (
    <TouchableOpacity style={styles.entry}>
      <Text style={styles.entryText}>{item.date}</Text>
      <Text style={styles.entryText}>{item.weight} kg</Text>
    </TouchableOpacity>
  );

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Registro de Peso Diário</Text>
      <View style={styles.inputContainer}>
        <TextInput
          style={styles.input}
          placeholder="Insira o seu peso (kg)"
          keyboardType="numeric"
          value={weight}
          onChangeText={setWeight}
        />
        <TouchableOpacity style={styles.addButton} onPress={addEntry}>
          <Ionicons name="add-circle-outline" size={24} color="#fff" />
        </TouchableOpacity>
      </View>
      <FlatList
        style={styles.list}
        data={entries}
        renderItem={renderEntry}
        keyExtractor={item => item.date}
        contentContainerStyle={{ paddingBottom: 20 }}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    paddingHorizontal: 20,
    paddingVertical: 40,
  },
  title: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 20,
  },
  inputContainer: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  input: {
    flex: 1,
    borderWidth: 1,
    borderColor: '#ddd',
    paddingVertical: 10,
    paddingHorizontal: 10,
    borderRadius: 10,
    marginRight: 10,
  },
  addButton: {
    backgroundColor: 'blue',
    borderRadius: 10,
    paddingVertical: 10,
    paddingHorizontal: 15,
  },
  list: {
    marginTop: 20,
  },
  entry: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    borderWidth: 1,
    borderColor: '#ddd',
    borderRadius: 10,
    paddingVertical: 10,
    paddingHorizontal: 15,
    marginBottom: 10,
  },
  entryText: {
    fontSize: 16,
    fontWeight: 'bold',
  },
});

export default App;

/*O código em si é um simples registro de peso - para evitar a obesidade por exemplo.
 Os registros podem ser registrados em uma lista e estes, podem ser exibidos na tela, até mesmo com a data
 e atualizações em tempo real.*/
