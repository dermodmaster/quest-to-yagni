package Field;

import Event.Event;
import Event.Finishevent;
import Event.Trapevent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JunitTestField {

    @Test
    void testingFinishfield() {
        boolean[] walls = {true,false,false,true};
        Finishevent fieldevent = new Finishevent(1,"Test");
        Field myfield = new Finishfield(255,walls, fieldevent);

        Assertions.assertEquals(255, myfield.getFieldId(),"Objekt hat eine falsche ID");
        Assertions.assertArrayEquals(walls, myfield.getWalls(),"Die Wände die gesetzt wurden, stimmen nicht mit den Wänden des Feldes überein.");
        Assertions.assertEquals("Finishfield", myfield.getType(),"Feld hat ein falsches Feld-Typ");
    }

    @Test
    void testingEventfield() {
        boolean[] walls = {true,false,false,true};
        Event fieldevent = new Trapevent(1,"Test");
        Field myfield = new Eventfield(255,walls,fieldevent);

        Assertions.assertEquals(255, myfield.getFieldId(),"Objekt hat eine falsche ID");
        Assertions.assertArrayEquals(walls, myfield.getWalls(),"Die Wände die gesetzt wurden, stimmen nicht mit den Wänden des Feldes überein.");
        Assertions.assertEquals("Eventfield", myfield.getType(),"Feld hat ein falsches Feld-Typ");
    }

    @Test
    void testingStartfield() {
        boolean[] walls = {true,false,false,true};
        Field myfield = new Startfield(255,walls);

        Assertions.assertEquals(255, myfield.getFieldId(),"Objekt hat eine falsche ID");
        Assertions.assertArrayEquals(walls, myfield.getWalls(),"Die Wände die gesetzt wurden, stimmen nicht mit den Wänden des Feldes überein.");
        Assertions.assertEquals("Startfield", myfield.getType(),"Feld hat ein falsches Feld-Typ");
    }

    @Test
    void testingPlayfield() {
        boolean[] walls = {true,false,false,true};
        Field myfield = new Playfield(255,walls);

        Assertions.assertEquals(255, myfield.getFieldId(),"Objekt hat eine falsche ID");
        Assertions.assertArrayEquals(walls, myfield.getWalls(),"Die Wände die gesetzt wurden, stimmen nicht mit den Wänden des Feldes überein.");
        Assertions.assertEquals("Playfield", myfield.getType(),"Feld hat ein falsches Feld-Typ");
    }
}