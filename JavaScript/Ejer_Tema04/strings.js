let nombre = "Marco";
let apellido = "Ferreira";
let estudiante = nombre.concat(" ", apellido);

let estudianteMayus = estudiante.toUpperCase();
let estudianteMinus = estudiante.toLowerCase();

let estudianteLongitud = estudiante.length;

let nombreInicio = nombre.at(0);
let apellidoFinal = apellido.charAt(apellido.length - 1);

let estudianteNoEspacios = estudiante.replace(/ /g, "");

let nombreEncontrado = estudiante.includes(nombre);