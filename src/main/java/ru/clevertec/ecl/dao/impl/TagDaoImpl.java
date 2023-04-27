package ru.clevertec.ecl.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.clevertec.ecl.entity.Tag;

import java.util.List;
import java.util.Optional;

@Repository
public class TagDaoImpl implements ru.clevertec.ecl.dao.impl.TagDao {

    private final static String SELECT_ALL_TAGS = "SELECT t FROM Tag t";
    private final SessionFactory sessionFactory;

    @Autowired
    public TagDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = new Configuration()
                .configure()
                .addPackage("ru.clevertec.ecl.entity")
                .buildSessionFactory();
    }

    @Override
    public Tag create(Tag tag) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(tag);

            session.getTransaction().commit();
            return tag;
        }
    }

    @Override
    public Optional<Tag> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(Tag.class, id));
        }
    }

    @Override
    public Tag update(Tag tag) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Tag merged = session.merge(tag);

            session.getTransaction().commit();
            return merged;
        }
    }

    @Override
    public List<Tag> findAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            List<Tag> resultList = session
                    .createQuery(SELECT_ALL_TAGS, Tag.class)
                    .getResultList();

            session.getTransaction().commit();
            return resultList;
        }
    }

    @Override
    public Optional<Tag> deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Optional<Tag> tag = findById(id);
            if (tag.isEmpty()) {
                return Optional.empty();
            }
            session.getTransaction().commit();
            return tag;
        }
    }
}
