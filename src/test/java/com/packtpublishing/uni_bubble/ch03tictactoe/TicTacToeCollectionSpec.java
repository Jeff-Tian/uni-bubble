package com.packtpublishing.uni_bubble.ch03tictactoe;

import static org.mockito.Mockito.*;

import org.jongo.MongoCollection;
import org.junit.Before;
import org.junit.Test;

import java.net.UnknownHostException;

public class TicTacToeCollectionSpec {
    TicTacToeCollection collection;

    @Before
    public void before() throws UnknownHostException {
        collection = spy(new TicTacToeCollection());
    }

    @Test
    public void whenInstantiatedThenMongoHasDbNameTicTacToe() {
        assertEquals("tic-tac-toe", collection.getMongoCollection().getDBCollection().getDB().getName());
    }

    @Test
    public void whenInstantiatedThenMongoCollectionHasNameGame() {
        assertEquals("game", collection.getMongoCollection().getName());
    }

    @Test
    public void whenSaveMoveThenInvokeMongoCollectionSave() {
        TicTacToeBean bean = new TicTacToeBean(3, 2, 1, 'Y');
        MongoCollection mongoCollection = mock(MongoCollection.class);
        doReturn(mongoCollection).when(collection).getMongoCollection();
        collection.saveMove(bean);
        verify(mongoCollection, times(1)).save(bean);
    }
}
