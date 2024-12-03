# ENUNCIADOS HIBERNATE

## EXERCICIO 1
SCRIPT:
```sql
DROP TABLE IF EXISTS Pokedex;
CREATE TABLE Pokedex (
Id SERIAL PRIMARY KEY ,
Nome VARCHAR(50) NOT NULL,
Peso DECIMAL(10, 2),
Misc TEXT
);
```
Implementa a entidade correspondente e unha clase que permita, **usando hibernate**, crear,
modificar, ler e eliminar rexistros, debe ter métodos que permitan facelo tanto con obxectos
(```session.get()``` por exemplo) como definindo queries (```session.createQuery()```).

Usa os métodos para executar a seguinte secuencia:
- Inserir 10 pokemons en la tabla pokedex
- Listar pokemons na pokedex
- Modificar duas entradas na pokedex
- Listar pokemons na pokedex
- Eliminar tódo-los pokemons na pokedex


## EXERCICIO 2
SCRIPT:
```sql
DROP TABLE IF EXISTS Adestrador;
DROP TABLE IF EXISTS Pokedex;
CREATE TABLE Pokedex (
Id SERIAL PRIMARY KEY ,
Nome VARCHAR(50) NOT NULL,
Peso DECIMAL(10, 2),
Misc TEXT
);
CREATE TABLE Adestrador (
Id SERIAL PRIMARY KEY ,
Nome VARCHAR(50) NOT NULL,
Nacemento DATE
);
```

Implementa as entidades correspondentes e unha clase por entidade que permita, **usando hibernate**, crear, modificar, ler e eliminar rexistros, debe ter métodos que permitan facelo
tanto con obxectos (```session.get()``` por exemplo) como definindo queries
(```session.createQuery()```).
Usa os métodos para executar a seguinte secuencia:
- Inserir 10 pokemons en la tabla pokedex
- Inserir 2 adestradores na taboa adestrador
- Listar pokemons na pokedex
- Listar adestradores
- Modificar dous adestradores
- Modificar duas entradas na pokedex
- Listar pokemons na pokedex
- Listar adestradores
- 🔴 (toXML pokemons)
- 🔴 (toXML adestradores)
- Eliminar tódo-los datos das táboas

Unha vez esto funcione, implementa un método toXML que permita exportar os datos
obtidos das táboas, debes chamalo entre o paso Listar e Eliminar da secuencia anterior
(está marcado en vermello)