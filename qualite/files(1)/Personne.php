<?php
namespace exo1;

class Personne
{
// Attributs
public $nom;
public $prenom;
public $dateDeNaissance;
public $taille;
public $sexe;
public $jambes = 2;
public $pieds =2 ;

// Constantes
const NOMBRE_DE_BRAS = 2;
const NOMBRE_DE_YEUX = 2;
const NOMBRE_DE_MAINS = 2;

// Méthodes
public function __construct($a1) {$this->nom=$a1; }
public function boire()
{
echo 'La personne boit<br/>';
}
public function manger()
{
echo 'La personne mange<br/>';
}

public function marche()
{
if ($this->pieds==2) echo 'la personne marche';
else throw new \InvalidArgumentException('trop de pieds');
}


public function irradier() {

if($this->pieds<5)
	{
$this->pieds++;
$this->jambes++;
	}
}

}

