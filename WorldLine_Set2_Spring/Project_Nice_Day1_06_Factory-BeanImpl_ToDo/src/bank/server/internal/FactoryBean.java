package bank.server.internal;

import bank.iserver.internal.service.AccountRepository;

public interface FactoryBean< AccountRepository> {

	Class<AccountRepositoryFactory> getObjectType();

	boolean isSingleton();

}
