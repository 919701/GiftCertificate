package ru.clevertec.ecl.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.clevertec.ecl.dao.GiftCertificateDao;
import ru.clevertec.ecl.entity.GiftCertificate;

import java.util.List;
import java.util.Optional;

@Repository
public class GiftCertificateDaoImpl implements GiftCertificateDao {
    private final SessionFactory sessionFactory;

    private final static String SELECT_ALL_GIFTCERTIFICATE = "SELECT gc FROM GiftCertificate gc";

    @Autowired
    public GiftCertificateDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = new Configuration()
                .configure()
                .addPackage("ru.clevertec.ecl.entity")
                .buildSessionFactory();
    }

    public GiftCertificate create(GiftCertificate giftCertificate) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            session.persist(giftCertificate);

            session.getTransaction().commit();
            return giftCertificate;
        }
    }

    @Override
    public Optional<GiftCertificate> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public GiftCertificate update(GiftCertificate giftCertificate) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            GiftCertificate merged = session.merge(giftCertificate);

            session.getTransaction().commit();
            return merged;
        }
    }

    @Override
    public List<GiftCertificate> findAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            List<GiftCertificate> resultList = session
                    .createQuery(SELECT_ALL_GIFTCERTIFICATE, GiftCertificate.class)
                    .getResultList();

            session.getTransaction().commit();
            return resultList;
        }
    }

    @Override
    public Optional<GiftCertificate> deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Optional<GiftCertificate> giftCertificate = findById(id);
            if (giftCertificate.isEmpty()) {
                return Optional.empty();
            }
            session.remove(giftCertificate.get());

            session.getTransaction().commit();
            return giftCertificate;
        }
    }
}
