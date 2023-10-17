package repository;

import data_access.ShapeDao;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class ShapeRepository implements IShapeRepository{

    public ShapeRepository() {

    }

    @Override
    public void display(Triangle trigle, Rectangle rectangle, Circle circle) {
        ShapeDao.Instance().display(trigle, rectangle, circle);
    }   

    @Override
    public Triangle inputTriangle() {
        return ShapeDao.Instance().inputTriangle();
    }

    @Override
    public Rectangle inputRectangle() {
        return ShapeDao.Instance().inputRectangle();
    }

    @Override
    public Circle inputCircle() {
        return ShapeDao.Instance().inputCircle();
    }
    
    
}
