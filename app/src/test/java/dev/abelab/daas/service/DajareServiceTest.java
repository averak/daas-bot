package dev.abelab.daas.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;

import dev.abelab.daas.db.entity.Dajare;
import dev.abelab.daas.repository.DajareRepository;

class DajareServiceTest {

	@Injectable
	DajareRepository dajareRepository;

	@Tested
	DajareService dajareService;

	@Test
	void 正_ダジャレを採点する() {
	}

	@Test
	void 正_前処理を加える() {
	}
}
