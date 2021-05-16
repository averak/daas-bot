package dev.abelab.daas.repository;

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
import dev.abelab.daas.db.mapper.DajareMapper;

class DajareRepositoryTest {
	@Injectable
	DajareMapper dajareMapper;

	@Tested
	DajareRepository dajareRepository;

	@Test
	void 正_ダジャレを保存する() {
	}

	@Test
	void 正_ダジャレが存在する() {
	}

	@Test
	void 異_ダジャレが存在しない() {
	}
}
