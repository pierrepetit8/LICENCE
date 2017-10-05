<?php
namespace exo1;

require_once('src/Personne.php');
class PersonneTest extends \PHPUnit_Framework_TestCase
{

public function testirradier()
    {
        $this->pers->irradier();
	$this->assertEquals(3,$this->pers->pieds);
	
    }

 }
