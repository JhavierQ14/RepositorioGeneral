drop table clase.materia;
use clase;
create table Materia(
idMateria int auto_increment not null,
NombreMateria varchar(45),
primary key(idMateria)
);

use clase;
create table Nota(
	idnota int auto_increment not null,
    nota varchar(45),
    fkMateria int not null,
    fkEstudiante int not null,
    primary key(idnota),
    Foreign key(fkMateria) references materia(idMateria),
    Foreign key(fkEstudiante) references estudiante(idEstudiante)
);

use clase;
select * from materia;
select * from estudiante;
select * from nota;

use clase;
select es.Nombre, es.Apellido, m.NombreMateria, n.nota from nota as n
inner join materia as m on n.fkMateria = m.idMateria
inner join estudiante as es on n.fkEstudiante = es.idEstudiante;