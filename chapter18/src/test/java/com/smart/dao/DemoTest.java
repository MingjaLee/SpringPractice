package com.smart.dao;

import com.smart.domain.Board;
import com.smart.test.dataset.util.XlsDataSetBeanFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringBean;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * @author jerry
 * @create 17/7/7 00:39
 */
public class DemoTest extends BaseDaoTest {
    @SpringBean("boardDao")
    private BoardDao boardDao;

    @Test
    @DataSet(value = "XiaoChun.Boards.xls")//准备数据
    @ExpectedDataSet(value = "XiaoChun.ExpectedBoards.xls")
    public void removeBoard() {
        Board board = boardDao.get(7);
        boardDao.remove(board);
    }

    @Test
    @ExpectedDataSet("XiaoChun.ExpectedBoards.xls")
    public void addBoard() throws Exception {
        //通过XlsDataSetBeanFactory数据集绑定工厂创建测试实体
        List<Board> boards = XlsDataSetBeanFactory.createBeans(BoardDaoTest.class, "XiaoChun.SaveBoards.xls", "t_board", Board.class);
        for (Board board : boards) {
            boardDao.save(board);
        }
    }

    @Test
    @DataSet("XiaoChun.Boards.xls")//准备数据
    public void getBoard() {
        Board board = boardDao.load(1);
        assertNotNull(board);
        assertEquals(board.getBoardName(), "育儿");
    }
}
