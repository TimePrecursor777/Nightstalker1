package net.timeprecursor.a_1_20_2.entity.ai;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.timeprecursor.a_1_20_2.entity.custom.NightstalkerEntity;

public class dinoattackgoal extends MeleeAttackGoal {
    private final NightstalkerEntity entity;
    private int attackdelay =  10;
    private int ticksuntillnextattack = 20;
    private boolean shouldcounttillnextattack = false;
    private double getAttackReachSqr(LivingEntity pEnemy) {
        return (double)(this.mob.getBbWidth() * 2.0F * this.mob.getBbWidth() * 2.0F + pEnemy.getBbWidth());
    }

    public dinoattackgoal(PathfinderMob pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        entity = ((NightstalkerEntity) pMob);
    }

    protected void checkandpreformattack(LivingEntity pEnemy, double pDistancetoenemysqr) {
        if (isenemywithinattackdistance(pEnemy, pDistancetoenemysqr)) {
            shouldcounttillnextattack = true;

            if (istimetostartattackanimation()) {
                entity.setAttacking(true);
            }

            if (istimetoattack()) {
                this.mob.getLookControl().setLookAt(pEnemy.getX(), pEnemy.getY(), pEnemy.getZ());
            }
        }else {
            this.resetAttackCooldown();
            shouldcounttillnextattack = false;
            entity.setAttacking(false);
            entity.attackanimationtimeout = 0;
        }
    }

    private boolean isenemywithinattackdistance(LivingEntity pEnemy, double pDisttoenemysqr) {
        return pDisttoenemysqr <= this.getAttackReachSqr(pEnemy);
    }

    protected void resetAttackCooldown() {this.ticksuntillnextattack = this.adjustedTickDelay(attackdelay * 3); }
    protected boolean istimetoattack() {return this.ticksuntillnextattack <= 0;}
    protected boolean istimetostartattackanimation() {return this.ticksuntillnextattack <= attackdelay;}
    protected int getTicksuntillnextattack() {return this.ticksuntillnextattack;}

    protected void preformattack(LivingEntity pEnemy) {
        this.resetAttackCooldown();
        this.mob.swing(InteractionHand.MAIN_HAND);
        this.mob.doHurtTarget(pEnemy);
    }




    @Override
    public void start() {
        super.start();
        attackdelay = 10;
        ticksuntillnextattack = 20;
    }

    @Override
    public void tick() {
        super.tick();
        if(shouldcounttillnextattack) {
            this.ticksuntillnextattack = Math.max(this.ticksuntillnextattack -1 ,0);
        }
    }

    @Override
    public void stop() {
        entity.setAttacking(false);
        super.stop();
    }
}
